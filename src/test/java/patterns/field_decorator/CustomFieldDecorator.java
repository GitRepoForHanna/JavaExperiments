package patterns.field_decorator;

import org.openqa.selenium.SearchContext;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.pagefactory.DefaultElementLocatorFactory;
import org.openqa.selenium.support.pagefactory.DefaultFieldDecorator;
import org.openqa.selenium.support.pagefactory.ElementLocator;
import org.openqa.selenium.support.pagefactory.ElementLocatorFactory;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;

public class CustomFieldDecorator extends DefaultFieldDecorator {
    public CustomFieldDecorator(SearchContext searchContext) {
        super(new DefaultElementLocatorFactory(searchContext));
    }

    @Override
    public Object decorate(ClassLoader loader, Field field) {
        Class<?> decoratableClass = decoratableClass(field);
        if(decoratableClass != null) {
            ElementLocator locator = factory.createLocator(field);
            if(locator == null) {
                return null;
            }
            return createElement(loader, locator, decoratableClass);

        }
        return super.decorate(loader, field);
    }

    protected Class<?> decoratableClass(Field field) {
        if(field != null){
            Class<?> klass = field.getType();
            try {
                klass.getConstructor(WebElement.class);
            } catch (NoSuchMethodException e) {
                return null;
            }
            return klass;
        }
        return null;
    }

    protected <T>T createElement(ClassLoader loader, ElementLocator locator, Class<?> klass) {
        WebElement proxy = proxyForLocator(loader, locator);
        return createInstance(proxy, klass);
    }

    private <T>T createInstance(WebElement element, Class<?>klass) {
        try {
            return (T)klass.getConstructor(WebElement.class).newInstance(element);
        } catch (Exception e) {
            throw new AssertionError("WebElement can't be represented as " + klass);
        }
    }


}
