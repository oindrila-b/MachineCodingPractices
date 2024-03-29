package Splitwise.SpliwiseOptimizationPart2.splitManager.validator.implementations;

import Splitwise.SpliwiseOptimizationPart2.model.splitModel.SplitModel;
import Splitwise.SpliwiseOptimizationPart2.splitManager.validator.SplitValidator;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

public class ExactSplitValidator implements SplitValidator {

    @Override
    public boolean isValid(List<SplitModel> splits,  Double totalAmount) {
        AtomicReference<Double> owedAmount = new AtomicReference<>(0.0);
        splits.forEach(splitModel -> {
          owedAmount.updateAndGet(v -> v + splitModel.getOwedAmount());
        });
        return Objects.equals(totalAmount, owedAmount.get());
    }
}
