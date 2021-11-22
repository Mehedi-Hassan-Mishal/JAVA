package interfaces;
import java.lang.*;
import classes.FoodItem;

public interface IQuantity
{
	public abstract void sellQuantity(int amount);
	void addQuantity(int amount);
}