class PayrollAccount {

    private double basicSalary;
    private double bonus;

    PayrollAccount(double basicSalary) {

        if (basicSalary < 0) {
            this.basicSalary = 0;
            System.out.println("Invalid salary. Salary set to 0.");
        } else {
            this.basicSalary = basicSalary;
        }

        this.bonus = 0;
    }

    void creditBonus(double amount) {

        if (amount <= 0) {
            System.out.println("Invalid bonus amount.");
        } else {
            bonus = bonus + amount;
            System.out.println("Bonus credited: Rs. " + amount);
        }
    }

    void deductTax(double percent) {

        if (percent < 0 || percent > 100) {
            System.out.println("Invalid tax percentage.");
        } else {
            basicSalary = basicSalary - (basicSalary * percent / 100);
            System.out.println("Tax deducted: " + percent + "%");
        }
    }

    double getNetSalary() {
        return basicSalary + bonus;
    }


    // MAIN METHOD
    public static void main(String[] args) {

        PayrollAccount account = new PayrollAccount(50000);

        account.creditBonus(5000);

        account.deductTax(10);

        System.out.println("Net Salary: Rs. "
                + account.getNetSalary());
    }
}