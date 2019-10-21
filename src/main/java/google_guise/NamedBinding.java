package google_guise;

import com.google.inject.AbstractModule;
import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;
import com.google.inject.name.Named;
import com.google.inject.name.Names;

public class NamedBinding {
//        public static void main(String[] args) {
//            Injector injector = Guice.createInjector(new google_guise.singletone.TextEditorModule());
//            google_guise.singletone.TextEditor editor = injector.getInstance(google_guise.singletone.TextEditor.class);
//            editor.makeSpellCheck();
//        }
//    }
//
//class TextEditor {
//    private google_guise.singletone.SpellChecker spellChecker;
//
//    @Inject
//    public TextEditor(@Named("OpenOffice") google_guise.singletone.SpellChecker spellChecker) {
//        this.spellChecker = spellChecker;
//    }
//
//    public void makeSpellCheck() {
//        spellChecker.checkSpelling();
//    }
//}
//
////Binding Module
//class TextEditorModule extends AbstractModule {
//    @Override
//
//    protected void configure() {
//        bind(google_guise.singletone.SpellChecker.class).annotatedWith(Names.named("OpenOffice"))
//                .to(OpenOfficeWordSpellCheckerImpl.class);
//
//        bind(google_guise.singletone.SpellChecker.class).to(google_guise.singletone.SpellCheckerImpl.class);
//    }
//}
//
////spell checker interface
//interface SpellChecker {
//    public void checkSpelling();
//}
//
////spell checker implementation
//class SpellCheckerImpl implements google_guise.singletone.SpellChecker {
//    @Override
//
//    public void checkSpelling() {
//        System.out.println("Inside checkSpelling." );
//    }
//}
//
////subclass of SpellCheckerImpl
//class OpenOfficeWordSpellCheckerImpl extends google_guise.singletone.SpellCheckerImpl {
//    @Override
//
//    public void checkSpelling() {
//        System.out.println("Inside OpenOfficeWordSpellCheckerImpl.checkSpelling." );
//    }
}