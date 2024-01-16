package webmini1;

import javax.jws.WebService;
import javax.jws.WebMethod;

@WebService(targetNamespace="http://www.webmini1")
public class TourServiceInfo {
    @WebMethod
    public String[] getTouristInfo() {
        String[] info = new String[20];
        
        // 以下是20条虚拟的旅游信息
        info[0] = "城市: 北京, 景点: 故宫 Ville : Pékin, Attraction : Cité interdite";
        info[1] = "城市: 上海, 景点: 外滩 Ville : Shanghai, Attraction : Le Bund ";
        info[2] = "城市: 巴黎, 景点: 埃菲尔铁塔 Ville : Paris, Attraction : Tour Eiffel";
        info[3] = "城市: 纽约, 景点: 自由女神像 Ville : New York, Attraction : Statue de la Liberté";
        info[4] = "城市: 伦敦, 景点: 伦敦眼 Ville : Londres, Attraction : London Eye";
        info[5] = "城市: 东京, 景点: 明治神宫 Ville : Tokyo, Attraction : Sanctuaire Meiji Jingu";
        info[6] = "城市: 柏林, 景点: 勃兰登堡门 Ville : Berlin, Attraction : Porte de Brandebourg";
        info[7] = "城市: 悉尼, 景点: 悉尼歌剧院 Ville : Sydney, Attraction : Opéra de Sydney";
        info[8] = "城市: 莫斯科, 景点: 红场 Ville : Moscou, Attraction : Place Rouge";
        info[9] = "城市: 开罗, 景点: 吉萨金字塔 Ville : Le Caire, Attraction : Pyramides de Gizeh";
        info[10] = "城市: 罗马, 景点: 罗马斗兽场 Ville : Rome, Attraction : Colisée";
        info[11] = "城市: 里约热内卢, 景点: 基督像 Ville : Rio de Janeiro, Attraction : Christ Rédempteur";
        info[12] = "城市: 墨西哥城, 景点: 特奥蒂瓦坎金字塔 Ville : Mexico, Attraction : Pyramides de Teotihuacan";
        info[13] = "城市: 阿姆斯特丹, 景点: 范·高博物馆 Ville : Amsterdam, Attraction : Musée Van Gogh";
        info[14] = "城市: 曼谷, 景点: 大皇宫 Ville : Bangkok, Attraction : Grand Palais";
        info[15] = "城市: 吉隆坡, 景点: 双子塔 Ville : Kuala Lumpur, Attraction : Tours jumelles Petronas";
        info[16] = "城市: 新德里, 景点: 印度门 Ville : New Delhi, Attraction : Porte de l'Inde";
        info[17] = "城市: 里斯本, 景点: 贝伦塔 Ville : Lisbonne, Attraction : Tour de Belém";
        
        info[18] = ("城市: 布宜诺斯艾利斯, 景点: 五月广场 Ville : Buenos Aires, Attraction : Plaza de Mayo");
        info[19] = ("城市: 开普敦, 景点: 好望角 Ville : Le Cap, Attraction : Cap de Bonne-Espérance");
        return info;
    }
}
