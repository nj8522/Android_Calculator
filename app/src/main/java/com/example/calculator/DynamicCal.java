package com.example.calculator;

public class DynamicCal {


    Processor[] result;

    public DynamicCal(Processor[] result){

        this.result = result;
    }



    public String process(String statements) {

        String[] split = statements.split(Processor.SEPERATOR);

        String symbol = split[1];


        double left = Double.parseDouble(split[0]);
        double right = Double.parseDouble(split[2]);


        Processor check = null;

        for(Processor verify : result){

            if(symbol.equalsIgnoreCase(verify.getSymbol())){

                check = verify;
                break;
            }
        }

        double calculate = check.doCalculation(left,right);


        StringBuilder sb = new StringBuilder(20);

        sb.append(calculate);

        return sb.toString();

    }


}
