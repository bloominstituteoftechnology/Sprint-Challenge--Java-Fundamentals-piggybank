package piggy;


    public abstract class Worth {
        int times;

        public Worth() {
            this.times = 1;
        }

        public Worth(int var1) {
            this.times *= var1;
        }

        public int getTimes() {
            return this.times;
        }

        public int setTimes(int var1) {
            int var2 = this.times * var1;
            return var2;
        }
    }

