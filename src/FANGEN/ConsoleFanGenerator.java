package FANGEN;

public class ConsoleFanGenerator extends FanGeneratorBase
{
    public ConsoleFanGenerator(int size, FanCharSet chars)
    {
        super(size, chars);

        this.generatorStream = System.out;
    }
}
