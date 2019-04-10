<!-- 网站整体布局风格：上中下风格  -->
<template>
  <div class="layout">
    <Layout>
      <Header></Header>
      <Content :style="{padding: '0 50px'}">
        <Breadcrumb :style="{margin: '20px 0'}">
          <BreadcrumbItem>Home</BreadcrumbItem>
          <BreadcrumbItem>Components</BreadcrumbItem>
          <BreadcrumbItem>Layout</BreadcrumbItem>
        </Breadcrumb>
        <Card>
          <div style="min-height: 200px;">
            Content
          </div>
        </Card>
      </Content>
    <Footer></Footer>
    </Layout>
  </div>
</template>
<script>
  export default {

  }
</script>

<style scoped>
  .layout{
    border: 1px solid #d7dde4;
    background: #f5f7f9;
    position: relative;
    border-radius: 4px;
    overflow: hidden;
  }


</style>
