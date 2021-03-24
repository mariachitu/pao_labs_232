package exemplu4contractimpl;

import exemplu4contractimpl.contract.Translator;
import exemplu4contractimpl.contractImpl.TranslatorEnImpl;
import exemplu4contractimpl.contractImpl.TranslatorRoImpl;

public class Main {
    public static void main(String[] args) {
        Translator eng = new TranslatorEnImpl();
        Translator ro = new TranslatorRoImpl();

        eng.saySomething("world");
        ro.saySomething("lume");
    }
}
