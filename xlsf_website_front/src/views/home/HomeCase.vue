<!--首页 经典案例 模块-->
<template>
  <div id="home-case">
    <div id="home-case-title">
      <span>经典案例</span>
    </div>
    <div id="home-case-detail">
      <div class="case-detail">
        <img src="http://img1.qunarzz.com/piao/fusion/1806/fc/e47aa3e1c67bbc02.jpg_750x200_0f3eecf8.jpg" />
      </div>
      <div class="case-detail">
        <img src="http://img1.qunarzz.com/piao/fusion/1806/fc/e47aa3e1c67bbc02.jpg_750x200_0f3eecf8.jpg" />
      </div>
      <div class="case-detail">
        <img src="http://img1.qunarzz.com/piao/fusion/1806/fc/e47aa3e1c67bbc02.jpg_750x200_0f3eecf8.jpg" />
      </div>
      <div class="case-detail">
        <img src="http://img1.qunarzz.com/piao/fusion/1806/fc/e47aa3e1c67bbc02.jpg_750x200_0f3eecf8.jpg" />
      </div>
      <div class="case-detail">
        <img src="http://img1.qunarzz.com/piao/fusion/1806/fc/e47aa3e1c67bbc02.jpg_750x200_0f3eecf8.jpg" />
      </div>
      <div class="case-detail">
        <img src="http://img1.qunarzz.com/piao/fusion/1806/fc/e47aa3e1c67bbc02.jpg_750x200_0f3eecf8.jpg" />
      </div>
    </div>
  </div>
</template>

<script>
  export default {
    name: 'HomeCase',
    components: {

    }
  }
</script>

<style>
  #home-case{
    height: 100%;
    width: 800px;
    margin:0 auto;
  }
  #home-case-title{
    font-size: 23px;
    margin:10px 0px 20px 0px;
  }
  .case-detail{
    display:inline;
    margin-right: 10px;
  }
  .case-detail img{
    width: 250px;
    height: 150px;
    margin-bottom: 30px;
  }
</style>
