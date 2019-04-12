<!-- 导航栏  -->
<template>
  <div id="top">
    <div id="logo">
      <a href="/"><img class="img-logo" src="../../static/images/logo.jpg"></a>
    </div>
    <div id="menu">
      <Menu mode="horizontal" theme="menuTheme" >
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
    width: 850px;
    margin:0 auto;
  }
  #logo{
    float: left;
  }
  #menu{
    padding-top: 20px;
    float: right;
  }
  .img-logo{
    border-radius: 3px;
    padding-left: 50px;
  }
  .layout-nav{
    margin: 0 auto;
    padding-top: 10px;
    padding-right: 10px;
    line-height: 40px;

  }
  MenuItem{
    padding-right: 8px;
  }
  a{
    color:#000000;
    font-size: 20px;
    font-family: 华文楷体;
  }
</style>
