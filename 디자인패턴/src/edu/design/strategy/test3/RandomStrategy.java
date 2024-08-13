
package edu.design.strategy.test3;

import java.util.Random;


public class RandomStrategy implements Strategy 
{
	Random random;

	public RandomStrategy(int seed) 
	{
		////seed를 이용하여 random객체를 생성한다.
		random= new Random(seed);
	}
	public Hand nextHand() 
	{
		////random의 nextInt(3)를 호출하고, Hand.getHand()를 호출한 결과를 리턴한다.
		int ran= random.nextInt(3);
		Hand result= Hand.getHand(ran);
		return result;
	}

	public void study(boolean win) 
	{

	}
}
