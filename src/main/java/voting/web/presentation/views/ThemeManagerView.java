package voting.web.presentation.views;

import voting.init.Model;

public class ThemeManagerView implements View {

    @Override
    public void show(Model model) {
        System.out.println("Helper1View \n" + model.get("msg"));
    }

}