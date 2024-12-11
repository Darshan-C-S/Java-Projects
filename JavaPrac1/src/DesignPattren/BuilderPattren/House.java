package DesignPattren.BuilderPattren;

public class House {
    private String foundation;
    private String structure;
    private String roof;
    private boolean swimmingPool ;

    public House(Builder builder){
        this.foundation = builder.foundation;
        this.structure = builder.structure;
        this.roof = builder.roof;
        this.swimmingPool = builder.swimmingPool;
    }

    @Override
    public String toString() {
        return "House {" +
                " foundation = '" + foundation + '\'' +
                ", structure = '" + structure + '\'' +
                ", roof = '" + roof + '\'' +
                ", swimming pool = '" + swimmingPool + '\'' +
                '}';
    }



    public static class Builder {
        private String foundation;
        private String structure;
        private String roof;
        private boolean swimmingPool;


        //        when we build a logic that supports chaining, we are returning this
        public Builder setFoundation(String foundation) {
            this.foundation = foundation;
            return this;
        }
        public Builder setStructure(String structure){
            this.structure = structure;
            return this;
        }
        public Builder setRoof(String roof){
            this.roof = roof;
            return this;
        }

        public Builder setSwimmingPool(boolean swimmingPool) {
            this.swimmingPool = swimmingPool;
            return this;
        }
        public House build(){
            return new House(this);
        }


    }
}
