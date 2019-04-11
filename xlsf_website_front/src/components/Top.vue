<template>
  <div id="top">
    <div id="logo">
      <a href="/"><img class="img-logo" src="../../static/images/logo.jpg"></a>
    </div>
    <div id="menu">
      <Menu theme="dark" active-name="1">
        <div class="layout-nav">
          <MenuItem name="home">
            <a href="/home">首页</a>
          </MenuItem>
          <MenuItem name="news">
            <a href="/home">新闻中心</a>
          </MenuItem>
          <MenuItem name="case">
            <a href="">经典案例</a>
          </MenuItem>
          <MenuItem name="server">
            <a href="">服务支持</a>
          </MenuItem>
          <MenuItem name="about">
            <a href="">关于公司</a>
          </MenuItem>
        </div>
      </Menu>
    </div>
  </div>
</template>

<script>
export default {
  name: 'top_website',
  data () {

  }
}
</script>

<style scoped>
  #top{
    height: 100%;
    width: 900px;
    margin:0 auto;
    font-family: 华文楷体;
    font-size: 23px;
  }
  #logo{
    float: left;
  }
  #menu{
    float: right;
  }
  .img-logo{
    border-radius: 3px;
    padding-left: 40px;
  }
  .layout-nav{
    margin: 0 auto;
    padding-top: 30px;
    padding-right: 30px;
  }
  MenuItem{
    padding-right: 8px;
  }
  a{
    color:#000000;
  }
</style>
