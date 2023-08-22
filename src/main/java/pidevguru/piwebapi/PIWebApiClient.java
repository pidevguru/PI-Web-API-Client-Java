package pidevguru.piwebapi;

import pidevguru.piwebapi.controllers.*;

public class PIWebApiClient
{
    private ApiClient apiClient = null;
    private String baseUrl = null;
    private String username = null;
    private String password = null;
    private Boolean cacheDisabled = null;
    private Boolean verifySsl = null;
    private Boolean debug = null;

    public PIWebApiClient(String baseUrl, String username, String password, Boolean verifySsl, Boolean debug)
    {
        this.baseUrl = baseUrl;
        this.username = username;
        this.password = password;
        this.cacheDisabled = true;
        this.debug = debug;
        this.verifySsl = verifySsl;
        buildClient();
    }


    private void buildClient() {
        this.apiClient = new ApiClient();
        this.apiClient.setVerifyingSsl(this.verifySsl);
        this.apiClient.setDebugging(this.debug);
        this.apiClient.buildClient();
        this.apiClient.setBasicAuth();
        this.apiClient.setUsername(this.username);
        this.apiClient.setPassword(this.password);
        this.apiClient.setBasePath(this.baseUrl);
    }

    public ApiClient getApiClient() { 
        return  this.apiClient; 
    }

    public AnalysisControllerClient getAnalysis()
    {
        return new AnalysisControllerClient(apiClient);
    }

    public AnalysisCategoryControllerClient getAnalysisCategory()
    {
        return new AnalysisCategoryControllerClient(apiClient);
    }

    public AnalysisRulePlugInControllerClient getAnalysisRulePlugIn()
    {
        return new AnalysisRulePlugInControllerClient(apiClient);
    }

    public AnalysisRuleControllerClient getAnalysisRule()
    {
        return new AnalysisRuleControllerClient(apiClient);
    }

    public AnalysisTemplateControllerClient getAnalysisTemplate()
    {
        return new AnalysisTemplateControllerClient(apiClient);
    }

    public AssetDatabaseControllerClient getAssetData()
    {
        return new AssetDatabaseControllerClient(apiClient);
    }

    public AssetServerControllerClient getAssetServer()
    {
        return new AssetServerControllerClient(apiClient);
    }

    public AttributeControllerClient getAttribute()
    {
        return new AttributeControllerClient(apiClient);
    }

    public AttributeCategoryControllerClient getAttributeCategory()
    {
        return new AttributeCategoryControllerClient(apiClient);
    }

    public AttributeTemplateControllerClient getAttributeTemplate()
    {
        return new AttributeTemplateControllerClient(apiClient);
    }

    public AttributeTraitControllerClient getAttributeTrait()
    {
        return new AttributeTraitControllerClient(apiClient);
    }

    public BatchControllerClient getBatch()
    {
      return new BatchControllerClient(apiClient);
    }

    public CalculationControllerClient getCalculation()
    {
        return new CalculationControllerClient(apiClient);
    }

    public ConfigurationControllerClient getConfiguration()
    {
        return new ConfigurationControllerClient(apiClient);
    }

    public DataServerControllerClient getDataServer()
    {
        return new DataServerControllerClient(apiClient);
    }

    public ElementControllerClient getElement()
    {
        return new ElementControllerClient(apiClient);
    }

    public ElementCategoryControllerClient getElementCategory()
    {
        return new ElementCategoryControllerClient(apiClient);
    }

    public ElementTemplateControllerClient getElementTemplate()
    {
        return new ElementTemplateControllerClient (apiClient);
    }

    public EnumerationSetControllerClient getEnumerationSet()
    {
        return new EnumerationSetControllerClient(apiClient);
    }

    public EnumerationValueControllerClient getEnumerationValue()
    {
        return new EnumerationValueControllerClient(apiClient);
    }

    public EventFrameControllerClient getEventFrame()
    {
        return new EventFrameControllerClient(apiClient);
    }


    public HomeControllerClient getHome()
    {
        return new  HomeControllerClient(apiClient);
    }

    public NotificationContactTemplateControllerClient getNotificationContactTemplate()  
     {    
        return new  NotificationContactTemplateControllerClient(apiClient); 
    }

    public NotificationRuleControllerClient NotificationRule()
    { 
        return new NotificationRuleControllerClient(apiClient);
    }

    public NotificationRuleSubscriberControllerClient NotificationRuleSubscriber() 
    { 
        return new NotificationRuleSubscriberControllerClient(apiClient); 
    }

    public NotificationRuleTemplateControllerClient NotificationRuleTemplate() {
        return new NotificationRuleTemplateControllerClient(apiClient);
    }

    public PointControllerClient getPoint()
    {
        return new PointControllerClient(apiClient);
    }

    public SecurityIdentityControllerClient getSecurityIdentity()
    {
        return new SecurityIdentityControllerClient(apiClient);
    }

    public SecurityMappingControllerClient getSecurityMapping()
    {
        return new SecurityMappingControllerClient(apiClient);
    }

    public StreamControllerClient getStream()
    {
        return new StreamControllerClient(apiClient);
    }

    public StreamSetControllerClient getStreamSet()
    {
        return new StreamSetControllerClient(apiClient);
    }


    public SystemControllerClient getSystem()
    {
        return new SystemControllerClient(apiClient);
    }

    public TableControllerClient getTable()
    {
        return new TableControllerClient(apiClient);
    }

    public TableCategoryControllerClient getTableCategory()
    {
        return new TableCategoryControllerClient(apiClient);
    }

    public TimeRuleControllerClient getTimeRule()
    {
        return new TimeRuleControllerClient(apiClient);
    }

    public TimeRulePlugInControllerClient getTimeRulePlugIn()
    {
        return new TimeRulePlugInControllerClient (apiClient);
    }

    public UnitControllerClient getUnit()
    {
        return new UnitControllerClient(apiClient);
    }

    public UnitClassControllerClient getUnitClass()
    {
        return new UnitClassControllerClient (apiClient);
    }
}
