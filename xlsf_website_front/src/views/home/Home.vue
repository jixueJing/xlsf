<template>
  <div id="home">
    <div class="top_website">
      <top_website></top_website>
    </div>
    <div class="footer_website">
      <footer_website></footer_website>
    </div>
  </div>
</template>

<script>

  export default {
    components: {
      top_website:require('../../components/Top.vue').default,
      footer_website:require('../../components/Footer.vue').default
    },
    name: 'Home'
  }
</script>

<style>
  #home {
    font-family: 'Avenir', Helvetica, Arial, sans-serif;
    -webkit-font-smoothing: antialiased;
    -moz-osx-font-smoothing: grayscale;
    text-align: center;
    color: #2c3e50;
    margin-top: 60px;
  }
  .top_website{
    height: 90px;
  }
  .footer_website{
    text-align: center;
    height: 150px;
    float: bottom;
  }
</style>
