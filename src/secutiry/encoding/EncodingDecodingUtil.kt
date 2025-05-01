package secutiry.encoding

import java.net.URLEncoder
import java.nio.charset.StandardCharsets

object EncodingDecodingUtil {
    private val charset = StandardCharsets.UTF_8
    fun encode(url: String): String = URLEncoder.encode(url, charset)
}