package service;

/**
 * User: u6613739
 * Date: 2019/3/8
 * Time: 14:13
 * Description:
 */
public class MSMessageServiceImp extends MSAbstractService implements MSMessageService
{
    @Override
    public void run()
    {
        while(true)
        {
            System.out.println("MessageService");
        }
    }
}
