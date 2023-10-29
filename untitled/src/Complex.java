
    public class Complex {
        private int RealPart; // 实数部分
        private int ImaginPart; // 虚数部分

        // 构造函数，将复数的实部和虚部都置为0
        public Complex() {
            this.RealPart = 0;
            this.ImaginPart = 0;
        }

        // 构造函数，初始化实部和虚部
        public Complex(int r, int i) {
            this.RealPart = r;
            this.ImaginPart = i;
        }

        // 将当前复数对象与形参复数对象相加，返回相加后的复数值
        public Complex complexAdd(Complex a) {
            this.RealPart += a.RealPart;
            this.ImaginPart += a.ImaginPart;
            return this;
        }

        // 将当前复数对象转换为字符串形式
        public String toString() {
            return RealPart + "+" + ImaginPart + "i";
        }



        public static void main(String[] args) {
            Complex c1 = new Complex(1, 2);
            Complex c2 = new Complex(7, 4);

            Complex result = c1.complexAdd(c2);
            System.out.println(result); // 输出结果为：4+6i
        }
    }



