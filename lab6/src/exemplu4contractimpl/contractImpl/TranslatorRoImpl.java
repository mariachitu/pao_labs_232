package exemplu4contractimpl.contractImpl;

import exemplu4contractimpl.contract.Translator;

public class TranslatorRoImpl implements Translator {
    @Override
    public void saySomething(String message) {
        System.out.println("Buna " + message);
    }
}
