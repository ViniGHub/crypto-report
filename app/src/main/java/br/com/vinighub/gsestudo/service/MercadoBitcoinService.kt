package carreiras.com.github.cryptomonitor.service

import br.com.vinighub.gsestudo.model.TickerResponse
import retrofit2.Response
import retrofit2.http.GET

interface MercadoBitcoinService {

    @GET("api/BTC/ticker/")
    suspend fun getTicker(): Response<TickerResponse>
}