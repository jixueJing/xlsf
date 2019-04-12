<!--首页模块-->
<template>
  <div id="home">
    <div class="top-website">
      <top_website></top_website>
    </div>
    <div class="home-content">
      <div id="home-loop">
        <home_loop></home_loop>
      </div>
      <div id="home-case">
        <home_case></home_case>
      </div>
    </div>
    <div class="footer-website">
      <footer_website></footer_website>
    </div>
  </div>
</template>

<script>

  export default {
    components: {
      top_website:require('../../components/Top.vue').default,
      footer_website:require('../../components/Footer.vue').default,
      home_loop:require('../../components/LoopCarousel.vue').default,
      home_case:require('./HomeCase.vue').default
    },
    name: 'Home'
  }
</script>

<style>
  #home {
    font-family: 'Avenir', Helvetica, Arial, sans-serif;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
    color: #2c3e50;
    margin-top: 60px;
  }
  .top-website{
    height: 90px;
  }
  .home-content{
    height: 100%;
  }
  .footer-website{
    text-align: center;
    height: 150px;
    float: bottom;
  }
</style>
