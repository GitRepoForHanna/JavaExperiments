package google_guise;

import com.google.inject.*;

public class ProvidingTestGuice {

    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new TextEditorModule1());
        TextEditor1 editor = injector.getInstance(TextEditor1.class);
        editor.makeSpellCheck();
    }
}

class TextEditor1 {
    private SpellChecker1 spellChecker;

    @Inject
    public TextEditor1( SpellChecker1 spellChecker) {
        this.spellChecker = spellChecker;
    }
    public void makeSpellCheck() {
        spellChecker.checkSpelling();
    }
}

//Binding Module
class TextEditorModule1 extends AbstractModule {
    @Override
    protected void configure() {}

    @Provides
    public SpellChecker1 provideSpellChecker() {
        String dbUrl = "jdbc:mysql://localhost:5326/emp";
        String user = "user";
        int timeout = 100;

        SpellChecker1 spellChecker = new SpellCheckerImpl1(dbUrl, user, timeout);
        return spellChecker;
    }
}

//spell checker interface
interface SpellChecker1 {
    public void checkSpelling();
}

//spell checker implementation
class SpellCheckerImpl1 implements SpellChecker1 {

    private String dbUrl;
    private String user;
    private Integer timeout;

    @Inject
    public SpellCheckerImpl1(String dbUrl,
                            String user,
                            Integer timeout) {
        this.dbUrl = dbUrl;
        this.user = user;
        this.timeout = timeout;
    }
    @Override
    public void checkSpelling() {
        System.out.println("Inside checkSpelling." );
        System.out.println(dbUrl);
        System.out.println(user);
        System.out.println(timeout);
    }
}
