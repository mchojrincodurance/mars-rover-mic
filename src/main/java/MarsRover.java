public class MarsRover {
    public String execute(String s) throws IllegalArgumentException {
        if ( s.isEmpty() ) {

            throw new IllegalArgumentException();
        }

        return "0:0:W";
    }
}
