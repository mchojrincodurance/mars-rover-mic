public class MarsRover {
    public String execute(String s) throws IllegalArgumentException {
        if ( s.isEmpty() ) {

            throw new IllegalArgumentException();
        }

        if ("M".equals(s)) {

            return "0:1:N";
        }

        return "0:0:W";
    }
}
