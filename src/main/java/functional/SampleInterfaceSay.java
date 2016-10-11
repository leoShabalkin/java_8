package functional;

/**
 * Created by Leonid_Shabalkin on 11/10/2016.
 */
@FunctionalInterface
public interface SampleInterfaceSay extends SampleInterface{
    SampleInterface a = new SampleInterface() {
        @Override
        public void say(String name) {
            System.out.println("anonymous method implementer"+name.toUpperCase());
        }
    };

    default void saySimple(String name) {
        a.say(name);
    }

}
