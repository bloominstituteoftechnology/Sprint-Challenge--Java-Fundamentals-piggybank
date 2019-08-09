package piggy;

    public class Bank extends Worth {
        public double value;

        public Bank(double var1) {
            this.value = var1;
        }

        public double getAll() {
            return this.value;
        }

        public double getMore(int var1) {
            return this.value * (double)var1;
        }

        public String toString() {
            String var1 = String.valueOf(this.value);
            return var1;
        }
    }

