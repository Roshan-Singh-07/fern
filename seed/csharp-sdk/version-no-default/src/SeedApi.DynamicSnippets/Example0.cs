using global::System.Threading.Tasks;
using SeedVersion;

namespace Usage;

public class Example0
{
    public async global::System.Threading.Tasks.Task Do() {
        var client = new SeedVersionClient(
            clientOptions: new ClientOptions{
                BaseUrl = "https://api.fern.com"
            }
        );

        await client.User.GetUserAsync(
            "userId"
        );
    }

}
