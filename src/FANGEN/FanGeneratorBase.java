package FANGEN;


import java.io.PrintStream;

public abstract class FanGeneratorBase
{
	protected PrintStream generatorStream;
	protected int fanSize;
	protected boolean isRightDirectionalFan;
	protected FanCharSet charset;

	public FanGeneratorBase(int size, FanCharSet charset)
	{
		this.fanSize = Math.abs(size * 2);
		this.isRightDirectionalFan = (size > 0);
		this.charset = charset;
	}

	/**
	 * Draws fan into stream
	 */
	public void draw()
	{
		if(this.isRightDirectionalFan == true)
			this.drawRightDirectionalFan();
		else
			this.drawLeftDirectionalFan();

		this.generatorStream.println();
	}


	protected void drawLeftDirectionalFan()
	{
		for(int x = 0; x < this.fanSize; x++)
		{
			for(int y = 0; y < this.fanSize; y++)
			{
				if(this.isTopHalfOfFan(y) &&   (this.isLeftHalfOfFan(x) && x < y + 1 || !this.isLeftHalfOfFan(x) && x < this.fanSize - y)
					|| !this.isTopHalfOfFan(y) &&   (this.isLeftHalfOfFan(x) && x >= this.fanSize - y - 1 || !this.isLeftHalfOfFan(x) && x >= y)
				)
					this.generatorStream.print(this.charset.getStar());
				else
					this.generatorStream.print(this.charset.getDot());
			}

			this.generatorStream.println();
		}
	}


	protected void drawRightDirectionalFan()
	{
		for(int x = 0; x < this.fanSize; x++)
		{
			for(int y = 0; y < this.fanSize; y++)
			{
				if( this.isTopHalfOfFan(y) &&    (this.isLeftHalfOfFan(x) && x >= y || !this.isLeftHalfOfFan(x) && x >= this.fanSize - y - 1)
					|| !this.isTopHalfOfFan(y) &&   (this.isLeftHalfOfFan(x) && x < this.fanSize - y || !this.isLeftHalfOfFan(x) && x <= y)
				)
					this.generatorStream.print(this.charset.getStar());
				else
					this.generatorStream.print(this.charset.getDot());
			}

			this.generatorStream.println();
		}
	}


	protected boolean isTopHalfOfFan(int y)
	{
		return (y < this.fanSize / 2);
	}


	protected boolean isLeftHalfOfFan(int x)
	{
		return (x < this.fanSize / 2);
	}
}








