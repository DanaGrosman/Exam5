package ajbc.exam5.q1.classes;

import ajbc.exam5.q1.interfaces.BadEnemy;

public class BadHelicopter implements BadEnemy{

	@Override
	public void yawsRight() {
		System.out.println("BadHelicopter yaws right");
	}

	@Override
	public void yawsLeft() {
		System.out.println("BadHelicopter yaws left");
	}

	@Override
	public void flyUp() {
		System.out.println("BadHelicopter flies up");
	}

	@Override
	public void flyDown() {
		System.out.println("BadHelicopter flies down");	
	}

	@Override
	public void launchesMissile() {
		System.out.println("BadHelicopter launches a missile");	
	}

}
