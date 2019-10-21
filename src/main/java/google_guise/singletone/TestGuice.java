package google_guise.singletone;

import com.google.inject.*;

public class TestGuice {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new TextEditorModule());
        SpellChecker spellChecker = new SpellCheckerImpl();
        injector.injectMembers(spellChecker);

        TextEditor editor = injector.getInstance(TextEditor.class);
        System.out.println(editor.getSpellCheckerId());

        TextEditor editor1 = injector.getInstance(TextEditor.class);
        System.out.println(editor1.getSpellCheckerId());
    }

}
class TextEditor {
    private SpellChecker spellChecker;

    @Inject
    public void setSpellChecker(SpellChecker spellChecker) {
        this.spellChecker = spellChecker;
    }
    public TextEditor() { }

    public void makeSpellCheck() {
        spellChecker.checkSpelling();
    }
    public double getSpellCheckerId() {
        return spellChecker.getId();
    }
}

//Binding Module
class TextEditorModule extends AbstractModule {
    @Override

    protected void configure() {
        bind(SpellChecker.class).to(SpellCheckerImpl.class);
//        bind(SpellCheckerImpl.class).in(Singleton.class);
    }
}
interface SpellChecker {
    public double getId();
    public void checkSpelling();
}
@Singleton
class SpellCheckerImpl implements SpellChecker {
    double id;

    public SpellCheckerImpl() {
        id = Math.random();
    }
    @Override
    public void checkSpelling() {
        System.out.println("Inside checkSpelling." );
    }
    @Override
    public double getId() {
        return id;
    }

}
