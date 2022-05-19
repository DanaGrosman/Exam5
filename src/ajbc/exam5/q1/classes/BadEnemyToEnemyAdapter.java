package ajbc.exam5.q1.classes;

import ajbc.exam5.q1.interfaces.BadEnemy;
import ajbc.exam5.q1.interfaces.Enemy;

public class BadEnemyToEnemyAdapter implements Enemy {

	private BadEnemy badEnemy;
	private String badEnemyName;

	public BadEnemyToEnemyAdapter(BadEnemy badEnemy) {
		this.badEnemy = badEnemy;
		badEnemyName = badEnemy.getClass().getSimpleName();
	}

	@Override
	public void turnRight() {
		System.out.print("This may be " + badEnemyName + " but its a Enemy that turn right: ");
		badEnemy.yawsRight();
	}

	@Override
	public void turnLeft() {
		System.out.print("This may be " + badEnemyName + " but its a Enemy that turn left: ");
		badEnemy.yawsLeft();
	}

	@Override
	public void driveForward() {
		System.out.print("This may be " + badEnemyName + " but its a Enemy the drive forword: ");
		badEnemy.flyUp();
	}

	@Override
	public void driveBackward() {
		System.out
				.print("This may be " + badEnemyName + " but its a Enemy that drive backward: ");
		badEnemy.flyDown();
	}

	@Override
	public void fireWeapon() {
		System.out
				.print("This may be " + badEnemyName + " but its a Enemy that fire a weapon: ");
		badEnemy.launchesMissile();
	}

}
