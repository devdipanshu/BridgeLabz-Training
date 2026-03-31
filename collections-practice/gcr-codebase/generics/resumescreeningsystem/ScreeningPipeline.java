package resumescreeningsystem;

import java.util.List;

class ScreeningPipeline {

    static void screenAll(List<? extends JobRole> roles) {

        for(int i = 0;i < roles.size();i++) {
            System.out.println(
                "Screening role requiring: "
                + roles.get(i).requiredSkills()
            );
        }
    }
}
