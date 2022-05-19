package ajbc.exam5.q1.classes;

import ajbc.exam5.q1.interfaces.Enemy;

public class EnemyTank implements Enemy {
	
	@Override
	public void turnRight() {
		System.out.println("EnemyTank turn right");
	}

	@Override
	public void turnLeft() {
		System.out.println("EnemyTank turn left");
	}

	@Override
	public void driveForward() {
		System.out.println("EnemyTank drive forward");

	}

	@Override
	public void driveBackward() {
		System.out.println("EnemyTank drive backward");
	}

	@Override
	public void fireWeapon() {
		System.out.println("EnemyTank fire a weapon");		
	}

}
