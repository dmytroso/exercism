public class SalaryCalculator {
    public double multiplierPerDaysSkipped(int daysSkipped) {
        return daysSkipped <= 5 ? 1 : 0.85;
    }

    public int multiplierPerProductsSold(int productsSold) {
        return productsSold <= 20 ? 10 : 13;
    }

    public double bonusForProductSold(int productsSold) {
        return this.multiplierPerProductsSold(productsSold) * productsSold;
    }

    public double finalSalary(int daysSkipped, int productsSold) {
        int salary = 1000;
        double calculatedSalary = this.bonusForProductSold(productsSold) + salary * this.multiplierPerDaysSkipped(daysSkipped);
        return calculatedSalary >= 2000 ? 2000 : calculatedSalary;
    }
}
