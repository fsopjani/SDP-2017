package flyweight

import java.util
import java.util.Map

object PlatformFactory {

  private var map: Map[String, Platform] = new util.HashMap[String, Platform]()

  map.put("C", new CPlatform)
  map.put("JAVA", new JavaPlatform)
  map.put("RUBY", new RubyPlatform)

  def getPlatformInstance(platformType: String): Platform = {
    this.synchronized {
      map.get(platformType)
    }
  }
  // this method will probably need to be synchronized

}
