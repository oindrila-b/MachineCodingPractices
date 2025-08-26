package old_practice.Splitwise.SpliwiseOptimizationPart2.splitManager.validator.implementations;

import old_practice.Splitwise.SpliwiseOptimizationPart2.model.splitModel.SplitModel;
import old_practice.Splitwise.SpliwiseOptimizationPart2.splitManager.validator.SplitValidator;

import java.util.List;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicReference;

/*****
 *  This method is to validate the equal split
 *
 */

public class DefaultSplitValidator implements SplitValidator {
    @Override
    public boolean isValid(List<SplitModel> splits, Double totalAmount) {
        AtomicReference<Double> owedAmount = new AtomicReference<>(0.0);
       splits.forEach(splitModel -> {
           owedAmount.updateAndGet( v -> v+ splitModel.getOwedAmount());
       });
        return Objects.equals(owedAmount.get(), totalAmount);
    }
}
