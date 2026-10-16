package core.basesyntax;

public class BalanceOperation implements OperationHandler {

    @Override
    public void handle(FruitTransaction transaction) {
        Storage.fruitModels.put(transaction.getFruit(), transaction.getQuantity());
    }
}
