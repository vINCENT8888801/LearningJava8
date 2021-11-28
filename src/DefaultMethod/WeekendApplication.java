package DefaultMethod;

import java.util.List;

interface IWeekend {
    default void doActivities() {
        System.out.println("Do Chores");
        System.out.println("Eat");
        System.out.println("Play");
        System.out.println("Jog");
        System.out.println("Rest");
    }
}

class ProductiveWeekend implements IWeekend {

    public void doActivities(List<String> learningList) {
        this.doActivities();
        learningList.forEach(subject -> System.out.println("Learning" + subject));
    }

    @Override
    public void doActivities() {
        this.doActivities();
        System.out.println("Do revision");
    }
}


class InproductiveWeekend implements IWeekend {
    @Override
    public void doActivities() {
        System.out.println("Eat");
        System.out.println("Sleep");
        System.out.println("Slack");
        System.out.println("Play");
        System.out.println("Rest");
    }

}

public class WeekendApplication {
    public static void main(String args[]) {

    }
}