package sub.case03;

import java.util.ArrayList;

public class VM {
  private ArrayList<String> vm;

  public VM() {
    vm = new ArrayList<>();
  }

  public ArrayList<String> getVm() {
    return vm;
  }

  public int getNumber() {
    return vm.size();
  }
}