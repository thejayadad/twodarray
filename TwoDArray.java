public class TwoDArray {


    public static void main(String[] args) {
        String[][] states = new String[3][2];
        states[0][0] = "South Carolina";
        states[0][1] = "Columbia";
        states[1][0] = "Georgia";
        states[1][1] = "Atlanta";
        states[2][0] = "Virgina";
        states[2][1] = "Richmond";

        for(int i = 0; i < states.length; i++){
            StringBuilder sb = new StringBuilder();
            sb.append("The Captial of ")
                    .append(states[i][0])
                    .append(" is ")
                    .append(states[i][1])
                    .append(".");
                    System.out.println(sb);
        }
    }
}
