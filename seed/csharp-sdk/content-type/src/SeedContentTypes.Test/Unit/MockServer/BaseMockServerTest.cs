using NUnit.Framework;
using SeedContentTypes;
using WireMock.Logging;
using WireMock.Server;
using WireMock.Settings;

namespace SeedContentTypes.Test.Unit.MockServer;

[SetUpFixture]
public class BaseMockServerTest
{
    protected static WireMockServer Server { get; set; } = null!;

    protected static SeedContentTypesClient Client { get; set; } = null!;

    protected static RequestOptions RequestOptions { get; set; } = new();

    [OneTimeSetUp]
    public void GlobalSetup()
    {
        // Start the WireMock server
        Server = WireMockServer.Start(
            new WireMockServerSettings { Logger = new WireMockConsoleLogger() }
        );

        // Initialize the Client
        Client = new SeedContentTypesClient(
            clientOptions: new ClientOptions { BaseUrl = Server.Urls[0], MaxRetries = 0 }
        );
    }

    [OneTimeTearDown]
    public void GlobalTeardown()
    {
        Server.Stop();
        Server.Dispose();
    }
}
