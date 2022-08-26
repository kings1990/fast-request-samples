@Grab("org.apache.commons:commons-lang3:3.12.0")
import org.apache.commons.lang3.StringUtils

import cn.hutool.core.util.CharsetUtil
import cn.hutool.core.util.StrUtil
import cn.hutool.crypto.digest.DigestUtil
import cn.hutool.http.HttpRequest
import cn.hutool.http.HttpUtil

//Note, note, note that following line of code needs to be removed from the script
//下面这行代码实际使用中需要删除
HttpRequest request = HttpUtil.createPost("http://localhost:8081/auth/login")


//script logic begin
String body = StrUtil.str(request.bodyBytes(), CharsetUtil.CHARSET_UTF_8)
if(StringUtils.isNotBlank(body)){
    String sign = DigestUtil.md5Hex(body)
    request.header("sign", sign)
}

//Note, note, note that following line of code needs to be removed from the script
//下面这行代码实际使用中需要删除
request.execute()
