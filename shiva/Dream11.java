class Dream11
{
static int pwd=1234;
static int indiaScore=0;
static int pakScore=0;

static void signup(int p1)
{
if(p1==pwd)
	{
	System.out.println("Sinup is Succefully done");
	login(p1);
	}
}
static void login(int p2)
{