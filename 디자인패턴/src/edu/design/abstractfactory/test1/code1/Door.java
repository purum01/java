package edu.design.abstractfactory.test1.code1;


public abstract class Door {

    private DoorStatus doorStatus;

    public Door() {
        doorStatus = DoorStatus.CLOSED;
    }

    public DoorStatus getDoorStatus() {
        return doorStatus;
    }

    public void close() { // 템플릿 메서드
        if (doorStatus == DoorStatus.CLOSED) return;
        doClose();
        doorStatus = DoorStatus.CLOSED;
    }

    protected abstract void doClose();

    public void open() { // 템플릿 메서드
        if (doorStatus == DoorStatus.OPENED) return;
        doOpen();
        doorStatus = DoorStatus.OPENED;
    }

    protected abstract void doOpen();
}
