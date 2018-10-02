public class cart{

  private int itemId;
  private int itemAmount;
  private int orderId;
  private int money;

  private String customerFirstName;
  private String customerLastName;
  private String customerEmail;
  private String customerStreet;
  private String customerCity;
  private String customerCountry;
  private String customerPoS;           //Province or customerLastName
  private String customerZipCode;
  private String customerPhone;


  public String order(int itemIdIn, int itemAmountIn, int orderIdIn, double moneyIn, String customerFirstNameIn, String customerLastNameIn, String customerEmailIn,
    String customerStreetIn, String customerCityIn, String customerCountryIn, String customerPoSIn, String customerZipCodeIn, String customerPhoneIn){

      itemId = itemIdIn;
      itemAmount = itemAmountIn;
      orderId = orderIdIn;
      money = moneyIn;
      customerFirstName = customerFirstNameIn;
      customerLastName = customerLastNameIn;
      customerEmail = customerEmailIn;
      customerStreet = customerStreetIn;
      customerCity = customerCityIn;
      customerCountry = customerCountryIn;
      customerPoS = customerPoSIn;
      customerZipCode = customerZipCodeIn;
      customerPhone = customerPhoneIn;
  }

  public String getOrder(){
    return itemId, itemAmount, money;
  }

}
