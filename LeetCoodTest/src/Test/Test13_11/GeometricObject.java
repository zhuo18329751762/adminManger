package Test.Test13_11;

import java.util.Date;

public abstract class GeometricObject {
        private String color = "white";
        private boolean filled;
        private Date dateCreated;

        // 构造方法
        protected GeometricObject() {
            dateCreated = new Date();
        }

        // 构造方法
        protected GeometricObject(String color, boolean filled) {
            dateCreated = new Date();
            this.color = color;
            this.filled = filled;
        }

        // 返回颜色
        public String getColor() {
            return color;
        }

        // 设置颜色
        public void setColor(String color) {
            this.color = color;
        }

        // 返回是否填充
        public boolean isFilled() {
            return filled;
        }

        // 设置是否填充
        public void setFilled(boolean filled) {
            this.filled = filled;
        }

        // 返回创建日期
        public java.util.Date getDateCreated() {
            return dateCreated;
        }

        // 返回对象的字符串表示
        public String toString() {
            return "created on " + dateCreated + "\ncolor: " + color +
                    " and filled: " + filled;
        }

        // 抽象方法，返回面积
        public abstract double getArea();

        // 抽象方法，返回周长
        public abstract double getPerimeter();
    }
