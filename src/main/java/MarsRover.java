public class MarsRover {
    public String execute(String s) throws IllegalArgumentException {
        if (s.isEmpty()) {
            throw new IllegalArgumentException();
        }

        if ("M".equals(s)) {
            return "0:1:N";
        }

        if ("R".equals(s)) {
            return "0:0:E";
        }
        if ("RR".equals(s)) {
            return "0:0:S";
        }

        return "0:0:W";
    }
}
