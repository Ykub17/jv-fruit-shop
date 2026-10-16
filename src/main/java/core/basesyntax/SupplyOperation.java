package core.basesyntax;

public class SupplyOperation implements OperationHandler {
    @Override
    public void handle(FruitTransaction transaction) {
        String fruit = transaction.getFruit();
        int quantity = transaction.getQuantity();

        int currentAmount = Storage.fruitModels.getOrDefault(fruit, 0);
        Storage.fruitModels.put(fruit,currentAmount + quantity);

    }
}
