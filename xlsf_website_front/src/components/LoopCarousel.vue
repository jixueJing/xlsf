<!-- 轮播图  -->
<template>
  <div id="carousel">
    <Carousel id="loop" autoplay autoplay-speed="3500" v-model="value2" >
      <CarouselItem class="caro-item">
        <img class="demo-img" src="http://img1.qunarzz.com/piao/fusion/1806/fc/e47aa3e1c67bbc02.jpg_750x200_0f3eecf8.jpg" />
      </CarouselItem>
      <CarouselItem class="caro-item">
        <img class="demo-img" src="http://img1.qunarzz.com/piao/fusion/1806/fc/e47aa3e1c67bbc02.jpg_750x200_0f3eecf8.jpg" />
      </CarouselItem>
      <CarouselItem class="caro-item">
        <img class="demo-img" src="http://img1.qunarzz.com/piao/fusion/1806/fc/e47aa3e1c67bbc02.jpg_750x200_0f3eecf8.jpg" />
      </CarouselItem>
      <CarouselItem class="caro-item">
        <img class="demo-img" src="http://img1.qunarzz.com/piao/fusion/1806/fc/e47aa3e1c67bbc02.jpg_750x200_0f3eecf8.jpg" />
      </CarouselItem>
    </Carousel>
  </div>
</template>

<script>
  export default {
    data () {
      return {
        value2: 0
      }
    }
  }
</script>
<style>
  #loop{

  }
  .caro-item{
    width: 100%;
  }
  img.demo-img{
    width: 100%;
  }
</style>
