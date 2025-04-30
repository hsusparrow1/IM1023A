import java.util.ArrayList;

public class WizardGuild {
    //建立ArrayList集合存儲Wizard類別
    ArrayList<Wizard> wizards = new ArrayList<>();

    public void addWizard(Wizard wizard){
        wizards.add(wizard);//添加元素
    }

    public Wizard findWizardByName(String name){
        //使用循環來找出是否有相同名字的元素
        for (int i = 0; i < wizards.size(); i++) {
            if(wizards.get(i).getName().equals(name)){
                //有找到就直接回傳對象
                return wizards.get(i);
            }
        }
        return  null;
    }

    public void removeWizardByName(String name){
        for (int i = 0; i < wizards.size(); i++) {
            if(wizards.get(i).getName().equals(name)){
                //有找到就直接刪除元素
                wizards.remove(i);
            }
        }
    }

    public void listAllWizards(){
        for (int i = 0; i < wizards.size(); i++) {
            System.out.println(wizards.get(i).toString());
        }
    }

    public void castGuildSpell(){
        for (int i = 0; i < wizards.size(); i++) {
            System.out.println(wizards.get(i).castSpell());
        }
    }
}
