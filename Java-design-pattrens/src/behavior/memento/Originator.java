package behavior.memento;

/**
 * 发起人
 * 记录当前时刻的内部状态信息，提供创建备忘录和恢复备忘录数据的功能，实现其他业务功能，它可以访问备忘录里的所有信息
 */
public class Originator {
    private String state;

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    Memento createMemento(){
        return new Memento(state);
    }

    void restoreMemento(Memento memento){
        this.setState(memento.getState());
    }
}
